package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KimYuna {
public static void main(String[] args) {
	Map<String,Integer> map= new HashMap<String,Integer>();
	map.put("김연아", new Integer(90));
	map.put("아사다마오", new Integer(50));
	map.put("소트니", new Integer(30));
	
	Set set =map.entrySet();
	Iterator it =set.iterator(); //shallow copy
	while (it.hasNext()) {
		Map.Entry e= (Entry) it.next();
		  System.out.println("참가자 : " + e.getKey() + ", 점수 : " + e.getValue());
    }
    // === 맵에서 키값만 볼 때 ===
    set = map.keySet();
    System.out.println("참가자 : " + set);
    // === 맵에서 키값과 상관없이 밸류값 연산을 할 때
    Collection values = map.values();
    it = values.iterator();
    int total = 0;
    while (it.hasNext()) {
       Integer i = (Integer) it.next();
       total += i.intValue();
    }
    System.out.println("대회 총점 : " + total);
    System.out.println("대회 평균 : " + total / set.size());
    System.out.println("대회 최고점 : " + Collections.max(values));
    System.out.println("대회 최저점 : " + Collections.min(values));
 }

}

/*
 * 
 * 
 * collection 은 인터페이스이고, List,Map,Set의 상위 개념(부모클래스)에 
 * collection는 필요한 기능을 모아 놓은 클래스임
 *  * 
 * */
 