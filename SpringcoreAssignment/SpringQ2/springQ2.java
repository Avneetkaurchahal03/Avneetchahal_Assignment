//test.java
import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class test {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			ApplicationContext ctx = new ClassPathXmlApplicationContext( "Customer.xml" );
			springQ2 c=(springQ2)ctx.getBean("questions");
			c.displayList();
			c.displaySet();
			c.displayMap();
		}

}
//SetAnswers.java

public class SetAnswers {
	private String set1;

	public SetAnswers() {
		super();
	}

	public SetAnswers(String set1) {
		super();
		this.set1 = set1;
	}

	public String getSet1() {
		return set1;
	}

	public void setSet1(String set1) {
		this.set1 = set1;
	}

	@Override
	public String toString() {
		return "Setclass [set1=" + set1 + "]";
	}

	public char[] getSetanswers() {
		// TODO Auto-generated method stub
		return null;
	}


}
//ListAnswers
public class ListAnswers {

private String list1;
	

	public ListAnswers() {
		super();
	}

	public ListAnswers(String list1) {
		super();
		this.list1 = list1;
	}

	public String getList1() {
		return list1;
	}

	public void setList1(String list1) {
		this.list1 = list1;
	}
	@Override
	public String toString() {
		return "Listclass [list1=" + list1 + "]";
	}


}

//springQ2.java
import java.util.List;
	import java.util.Map;
	import java.util.Set;

	public class springQ2 {
			private int questionId;
			private String question;
			private List<ListAnswers> l;
			private Set<SetAnswers> s;
			private Map<Integer,String> m;
			

			public Map<Integer, String> getM() {
				return m;
			}


			public void setM(Map<Integer, String> m) {
				this.m = m;
			}


			
			public int getQuestionId() {
				return questionId;
			}


			public void setQuestionId(int questionId) {
				this.questionId = questionId;
			}


			public String getQuestion() {
				return question;
			}


			public void setQuestion(String question) {
				this.question = question;
			}


			public List<ListAnswers> getL() {
				return l;
			}


			public void setL(List<ListAnswers> l) {
				this.l = l;
			}


			public Set<SetAnswers> getS() {
				return s;
			}


			public void setS(Set<SetAnswers> s) {
				this.s = s;
			}


			
			public void displayList() {
				System.out.println("-------List-------");
				System.out.println("Que: "+getQuestion());
				System.out.println("Ans:");
				for(ListAnswers a:l) {
				System.out.println(a.getList1());
				}
			}
			public void displaySet() {
				System.out.println("\n-------Set-------");
				System.out.println("Que: "+getQuestion());
				System.out.println("Ans:");
				for(SetAnswers s1:s) {
				System.out.println(s1.getSetanswers());
				}
			}
			public void displayMap() {
				System.out.println("\n-------Mapt-------");
				System.out.println("Que: "+getQuestion());
				System.out.println("Ans:");
				for (Map.Entry<Integer, String> set : m.entrySet()) {
				    System.out.println(set.getKey() + " = " + set.getValue());
				
				}
			}
		}



