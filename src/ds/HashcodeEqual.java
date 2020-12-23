package ds;
public class HashcodeEqual {

}



class EMP{
	int id;
	public EMP(int id){
		this.id=id;
	}
	public boolean equals(Object o1){
		if(o1==null) return false;
		if (!(o1 instanceof HashcodeEqual))
			return false;	
		if (o1 == this)
			return true;
		return false;
		
		
		
	}
}