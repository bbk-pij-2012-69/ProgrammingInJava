// Guitar implementation using composition and delegation
public class Guitar implements MusicalInstrumentInterface, WoodenObjectInterface {
	private MusicalInstrumentInterface instrument;
	private WoodenObjectInterface wooden;
	
	Guitar()
	{
		this.init(new MusicalInstrument(), new WoodenObject());
	}
	
	Guitar(MusicalInstrumentInterface instrument)
	{
		this.init(instrument, new WoodenObject());
	}

	Guitar(WoodenObjectInterface wooden)
	{
		this.init(new MusicalInstrument(), wooden);
	}

	Guitar(MusicalInstrumentInterface instrument, WoodenObjectInterface wooden)
	{
		this.init(instrument, wooden);
	}

	private void init(MusicalInstrumentInterface instrument, WoodenObjectInterface wooden)
	{
		this.instrument = instrument;
		this.wooden = wooden;
	}
	
	@Override
	public void burn() {
		this.wooden.burn();

	}

	@Override
	public void play() {
		this.instrument.play();
	}

	public static void main(String[] args)
	{
		Guitar fender = new Guitar(new MusicalInstrument(), new WoodenObject());
		fender.play();
		fender.burn();
	}
	
}
