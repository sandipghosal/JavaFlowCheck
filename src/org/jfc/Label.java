package org.jfc;

import java.util.HashSet;
import java.util.Set;


public class Label {
	private String owner;
	private Set<String> readers=new HashSet<String>();
	private Set<String> writers=new HashSet<String>();
	
	public Label(String owner, Set<String> readers, Set<String> writers) {
		this.owner=owner;
		this.setReaders(readers);
		this.setWriters(writers);
	}
	
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Set<String> getReaders() {
		return readers;
	}
	
	public void setReaders(Set<String> readers) {
		this.readers.clear();
		this.readers=readers;
	}
	
	public Set<String> getWriters() {
		return writers;
	}
	
	public void setWriters(Set<String> writers) {
		this.writers=writers;
	}
	
}
