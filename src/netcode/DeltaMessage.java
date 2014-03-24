package netcode;
import java.util.ArrayList;
import java.io.Serializable;

public class DeltaMessage implements Message, Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Pixel> pixels;

	public DeltaMessage()
	{
		pixels = null;
	}

	public DeltaMessage(ArrayList<Pixel> pixels)
	{
		this.pixels = pixels;
	}

	public ArrayList<Pixel> getPayload()
	{
		return pixels;
	}
}
