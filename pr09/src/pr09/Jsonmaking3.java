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
		
		Object K15_obj = K15_parser.parse(new FileReader("C:\\Users\\����\\Desktop\\test.json"));
		JSONArray K15_array = (JSONArray)K15_obj;   //Ű�� �����Ƿ� ���� ����
		
		System.out.println("*****************************************");
		for (int K15_i = 0 ; K15_i < K15_array.size(); K15_i++) {
		//array ���̸�ŭ �ݺ�
			JSONObject K15_result = (JSONObject) K15_array.get(K15_i);
			//array���� �ϳ��� ����
			System.out.println("�̸� : " + K15_result.get("name"));
			//�̸��� ���� ������
			System.out.println("�й� : " + K15_result.get("studentid"));
			//�й��� ������
			JSONArray K15_score = (JSONArray) K15_result.get("score");
			//������ ������ �迭�� ����
			long K15_kor = (long)K15_score.get(0);
			//�迭�� ù��°���� ����
			long K15_eng = (long)K15_score.get(1);
			//�迭�� �ι�° ���� ����
			long K15_mat = (long)K15_score.get(2);
			//�迭 �� ����° ���� ����   		
			System.out.println("���� : " + K15_kor);															//����� ���� ���
			System.out.println("���� : " + K15_eng);															//����� ���� ���
			System.out.println("���� : " + K15_mat);															//���а� ���� ���
			System.out.println("���� : " + (K15_kor + K15_eng + K15_mat));					//������ ���� ���
			System.out.println("��� : " + ((K15_kor + K15_eng + K15_mat) / 3.0));			//��հ� ���� ���
			System.out.println("***********************************************");
			
		}
		

	}

}
