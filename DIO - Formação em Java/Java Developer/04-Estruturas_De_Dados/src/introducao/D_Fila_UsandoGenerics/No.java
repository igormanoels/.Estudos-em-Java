package introducao.D_Fila_UsandoGenerics;

public class No <T>
{
	private T obj;
	private No<T> refNo;
	
	public No(T no) 
	{
		this.obj = no;
		this.refNo = null; 
	}
	
	public No() {}

	public T getNo() {
		return obj;
	}

	public void setNo(T no) {
		this.obj = no;
	}

	public No<T> getRefNo() {
		return refNo;
	}

	public void setRefNo(No<T> refNo) {
		this.refNo = refNo;
	}
	
	@Override
	public String toString() 
	{
		return "" + obj;
	}
}
