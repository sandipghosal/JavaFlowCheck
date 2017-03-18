package org.jfc;

import java.util.Set;

public class RWFMLabelOperation {
	
	public Set<String> intersection(Label source, Label target)
	{
		
	}

	public boolean isEqual(Label label1, Label label2)
	{
		if(label1.getOwner().equals(label2.getOwner()))
		{
			if(label1.getReaders().equals(label2.getReaders()) && label1.getWriters().equals(label2.getWriters()))
			{
				return true;
			}
		}
		
		return false;
	}
}
