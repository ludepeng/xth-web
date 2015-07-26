package com.xth.ws.util;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MapAdapter extends XmlAdapter<MapConvertor, HashMap<String, String>> {

	/**
	 * XML to JAVA
	 */
	@Override
	public HashMap<String, String> unmarshal(MapConvertor map) throws Exception {

		HashMap<String, String> result = new HashMap<String, String>();

		// 遍历MapConvertor，将XML节点内容写入JavaBean Map对象
		for (MapConvertor.MapEntry e : map.getEntries()) {
			result.put(e.getKey(), e.getValue());
		}
		return result;
	}

	/**
	 * JAVA to XML
	 */
	@Override
	public MapConvertor marshal(HashMap<String, String> map) throws Exception {
		// 创建MapConvertor对象，盛放XML节点内容
		MapConvertor convertor = new MapConvertor();
		// 遍历map，将JavaBean中的数据写入XML节点
		for (Map.Entry<String, String> entry : map.entrySet()) {

			// 创建空的MapEntry对象（该mapEntry应该放在循环内，防止重复使用同一个java对象引用）
			MapConvertor.MapEntry mapEntry = new MapConvertor.MapEntry();
			mapEntry.setKey(entry.getKey());
			mapEntry.setValue(entry.getValue());

			convertor.addEntries(mapEntry);
		}
		return convertor;
	}
}
