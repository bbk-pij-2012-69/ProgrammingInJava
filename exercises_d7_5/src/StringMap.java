
public class StringMap implements SimpleMap {
	int[] keys = new int[5];
	String[] names = new String[5];
	
	@Override
	public void put(int key, String name) {
		if(keys[keys.length -1] != 0)
			this.extendArrays();
		
		for(int i = 0; i < this.keys.length; ++i)
		{
			if(this.keys[i] == 0)
			{
				this.keys[i] = key;
				this.names[i] = name;
			}
		}
	}

	private void extendArrays()
	{
		int[] tmpKeys = this.keys;
		String[] tmpNames= this.names;
		
		this.keys = new int[tmpKeys.length * 2];
		this.names = new String[tmpNames.length * 2];
		
		for(int i = 0; i < this.keys.length; ++i)
		{
			this.keys[i] = tmpKeys[i];
			this.names[i] = tmpNames[i];
		}
	}
	
	@Override
	public String get(int key) {
		
		for(int i = 0; i < this.keys.length; ++i)
			if(this.keys[i] == key)
				return this.names[i];

		return null;
	}

	@Override
	public void remove(int key) {
		for(int i = 0; i < this.keys.length; ++i)
		{
			if(this.keys[i] == key)
			{
				this.keys[i] = 0;
				this.names[i] = null;
			}
		}	

	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		for(int i = 0; i < this.keys.length; ++i)
			empty = this.keys[i] == 0;
		
		return empty;
	}

}
