package OOP;

public class KaupServiceImpl implements KaupService{
	//접근제한자+리턴타입+메소드명+메소드연산자+블록
	
	public String getState(double height, double weight) {
		//메소드 연산자 내부에 선언된 변수는 본질적으로 지역변수이고, 매개변수 parameter라고 부른다.
	
		String name="";
		
		int index= (int) ((weight/(height*height))*10000);
		String result = "";
		
		if (index>30) {
			result="비만"; 
		} else if(index>24){
			result="과체중"; 
		} else if(index>20){
			result="정상"; 
		} else if(index>15){
			result="저체중"; 
		} else if(index>13){
			result="마름"; 
		} else if(index>10){
			result="영양실조"; 
		} else{
			result="소모증"; 
		}

		return result;
	}
}

