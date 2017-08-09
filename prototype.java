import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;

	public Employees(){
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list){
		this.empList=list;
	}
	public void loadData(){

		empList.add("dd1");
		empList.add("dd2");
		empList.add("dd3");
		empList.add("dd34");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList()){
			temp.add(s);
		}
		return new Employees(temp);
	}

}