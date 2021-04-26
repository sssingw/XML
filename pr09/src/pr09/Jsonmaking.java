package pr09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonmaking {

	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject K15_dataObject = new JSONObject();   //JSON 객체 생성
	
		K15_dataObject.put("name", name);					//JSON  객체 생성, 각각의 값을 저장
		K15_dataObject.put("studentid", studentid);		//JSON  객체 생성, 각각의 값을 저장		
		JSONArray K15_score = new JSONArray();			//JSON array를 생성
		K15_score.add(kor); K15_score.add(eng); K15_score.add(mat);		//JSON array에 각각의 해당 점수를 저장
		K15_dataObject.put("score",K15_score);											//JSON  객체 생성, 각각의 값을 저장		
		
		return K15_dataObject;																		//JSON 객체를 return
	}

	public static void main(String[] args) {
		JSONObject jsonobject = new JSONObject();
		//최종 완성될 JSONobject 선언(전체)
		JSONArray one_datasArray = new JSONArray();
		//한명 성적의 JSON정보를 담을 Array 선언
		JSONObject one_dataObject = new JSONObject();
		//한명 정보가 들어갈 JSONObject 선언
		one_dataObject.put("name",  "나연");
		//JSONObject에 각각의 값을 저장
		one_dataObject.put("studentid", 209901);
		//JSONObject에 각각의 값을 저장
		JSONArray K15_score = new JSONArray();
		//K15_score이라는 JSON배열을 생성
		K15_score.add(90); K15_score.add(100);K15_score.add(95);
		//JSON배열에 90, 100, 95를 저장
		one_dataObject.put("score", K15_score);
		//한명의 정보가 들어갈  JSON객체에 "score"와 K15_score의 배열을 넣음
		one_datasArray.add(one_dataObject);
		//one_datasArray 배열에 dataObject를 넣음 
		
		one_datasArray.add(oneRec("정연", 209902, 100, 85, 75));   //one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("모모", 209903, 90, 75, 85));		//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("사나", 209904, 90, 85, 75));		//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("지효", 209905, 80, 75, 85));		//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("미나", 209906, 90, 85, 55));		//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("다연", 209907, 70, 75, 65));		//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("채영", 209908, 100, 75, 95));	//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		one_datasArray.add(oneRec("쯔위", 209909, 80, 65, 95));		//one_datasArray에 oneRec메서드에 각각의 값을 넣어 리턴받아 추가
		
		try {
			FileWriter K15_file = new FileWriter("C:\\Users\\성원\\Desktop\\test.json");
			//출력할 파일 위치 지정
			K15_file.write(one_datasArray.toJSONString());
			//one_datasArray의 내용을 JSONString으로 변환해 씀
			K15_file.flush();
			//flush를 이용해 메모리에 있는 것을 바로 씀
			K15_file.close();
			//다썼으면 close로 닫음
		} catch (IOException e) {
			e.printStackTrace();				 //예외처리
		}
		System.out.println("JSON 만든 거 : " + one_datasArray);  //one_datasArray의 내용을 출력
	}


		

	}
