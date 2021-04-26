package pr09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Jsonmaking3 {

	public static void main(String[] args)  throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		
		JSONParser K15_parser = new JSONParser();
		
		Object K15_obj = K15_parser.parse(new FileReader("C:\\Users\\성원\\Desktop\\test.json"));
		JSONArray K15_array = (JSONArray)K15_obj;   //키가 없으므로 연결 가능
		
		System.out.println("*****************************************");
		for (int K15_i = 0 ; K15_i < K15_array.size(); K15_i++) {
		//array 길이만큼 반복
			JSONObject K15_result = (JSONObject) K15_array.get(K15_i);
			//array에서 하나씩 빼옴
			System.out.println("이름 : " + K15_result.get("name"));
			//이름을 먼저 가져옴
			System.out.println("학번 : " + K15_result.get("studentid"));
			//학번을 가져옴
			JSONArray K15_score = (JSONArray) K15_result.get("score");
			//성적을 가져와 배열에 넣음
			long K15_kor = (long)K15_score.get(0);
			//배열중 첫번째값은 국어
			long K15_eng = (long)K15_score.get(1);
			//배열중 두번째 값은 영어
			long K15_mat = (long)K15_score.get(2);
			//배열 중 세번째 값은 수학   		
			System.out.println("국어 : " + K15_kor);															//국어와 값을 출력
			System.out.println("영어 : " + K15_eng);															//영어와 값을 출력
			System.out.println("수학 : " + K15_mat);															//수학과 값을 출력
			System.out.println("총점 : " + (K15_kor + K15_eng + K15_mat));					//총점과 값을 출력
			System.out.println("평균 : " + ((K15_kor + K15_eng + K15_mat) / 3.0));			//평균과 값을 출력
			System.out.println("***********************************************");
			
		}
		

	}

}
