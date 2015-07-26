package com.xth.ws.model;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.xth.ws.util.MapAdapter;

public class MapParam {

	private List<HashMap<String, String>> entry;

	public MapParam() {
		super();
	}

	public MapParam(List<HashMap<String, String>> entry) {
		super();
		this.entry = entry;
	}

	@XmlElement(name = "string2stringMap")
	@XmlJavaTypeAdapter(MapAdapter.class)
	public List<HashMap<String, String>> getEntry() {
		return entry;
	}

	public void setEntry(List<HashMap<String, String>> entry) {
		this.entry = entry;
	}

}
