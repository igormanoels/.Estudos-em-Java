package introducao.D_Fila;

public class No 
{
	private Object obj;
	private No refNo;
	
	public No(Object no) 
	{
		this.obj = no;
		this.refNo = null; 
	}
	
	public No() {}

	public Object getNo() {
		return obj;
	}

	public void setNo(String no) {
		this.obj = no;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
	
	@Override
	public String toString() 
	{
		return "" + obj;
	}
}
