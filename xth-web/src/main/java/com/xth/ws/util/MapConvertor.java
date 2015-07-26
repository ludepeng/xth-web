package com.xth.ws.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MapConvertor")
@XmlAccessorType(XmlAccessType.FIELD)
public class MapConvertor {

	// SOAP报文结构是一个Map的List
	private List<MapEntry> entries = new ArrayList<MapEntry>();

	public void addEntries(MapEntry entry) {
		entries.add(entry);
	}

	public List<MapEntry> getEntries() {
		return entries;
	}

	public static class MapEntry {

		private String key;

		private String value;

		public MapEntry() {
			super();
		}

		public MapEntry(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		public MapEntry(Entry<String, String> entry) {
			super();
			this.key = entry.getKey();
			this.value = entry.getValue();
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}
}
