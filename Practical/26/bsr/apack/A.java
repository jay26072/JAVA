package bsr.apack;
public class A
{
	protected int x;
	private int y;
	public int z;
	public A()
	{
		this.x=10;
		this.y=20;
		this.z=30;
	}
	public A(int x,int y, int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int getX()
	{
		return(this.x);
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public int getY()
	{
		return(this.y);
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getZ()
	{
		return(this.z);
	}
	public void setZ(int z)
	{
		this.z=z;
	}
	
}