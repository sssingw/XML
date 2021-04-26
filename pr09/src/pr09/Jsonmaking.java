package pr09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonmaking {

	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject K15_dataObject = new JSONObject();   //JSON ��ü ����
	
		K15_dataObject.put("name", name);					//JSON  ��ü ����, ������ ���� ����
		K15_dataObject.put("studentid", studentid);		//JSON  ��ü ����, ������ ���� ����		
		JSONArray K15_score = new JSONArray();			//JSON array�� ����
		K15_score.add(kor); K15_score.add(eng); K15_score.add(mat);		//JSON array�� ������ �ش� ������ ����
		K15_dataObject.put("score",K15_score);											//JSON  ��ü ����, ������ ���� ����		
		
		return K15_dataObject;																		//JSON ��ü�� return
	}

	public static void main(String[] args) {
		JSONObject jsonobject = new JSONObject();
		//���� �ϼ��� JSONobject ����(��ü)
		JSONArray one_datasArray = new JSONArray();
		//�Ѹ� ������ JSON������ ���� Array ����
		JSONObject one_dataObject = new JSONObject();
		//�Ѹ� ������ �� JSONObject ����
		one_dataObject.put("name",  "����");
		//JSONObject�� ������ ���� ����
		one_dataObject.put("studentid", 209901);
		//JSONObject�� ������ ���� ����
		JSONArray K15_score = new JSONArray();
		//K15_score�̶�� JSON�迭�� ����
		K15_score.add(90); K15_score.add(100);K15_score.add(95);
		//JSON�迭�� 90, 100, 95�� ����
		one_dataObject.put("score", K15_score);
		//�Ѹ��� ������ ��  JSON��ü�� "score"�� K15_score�� �迭�� ����
		one_datasArray.add(one_dataObject);
		//one_datasArray �迭�� dataObject�� ���� 
		
		one_datasArray.add(oneRec("����", 209902, 100, 85, 75));   //one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("���", 209903, 90, 75, 85));		//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("�糪", 209904, 90, 85, 75));		//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("��ȿ", 209905, 80, 75, 85));		//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("�̳�", 209906, 90, 85, 55));		//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("�ٿ�", 209907, 70, 75, 65));		//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("ä��", 209908, 100, 75, 95));	//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		one_datasArray.add(oneRec("����", 209909, 80, 65, 95));		//one_datasArray�� oneRec�޼��忡 ������ ���� �־� ���Ϲ޾� �߰�
		
		try {
			FileWriter K15_file = new FileWriter("C:\\Users\\����\\Desktop\\test.json");
			//����� ���� ��ġ ����
			K15_file.write(one_datasArray.toJSONString());
			//one_datasArray�� ������ JSONString���� ��ȯ�� ��
			K15_file.flush();
			//flush�� �̿��� �޸𸮿� �ִ� ���� �ٷ� ��
			K15_file.close();
			//�ٽ����� close�� ����
		} catch (IOException e) {
			e.printStackTrace();				 //����ó��
		}
		System.out.println("JSON ���� �� : " + one_datasArray);  //one_datasArray�� ������ ���
	}


		

	}
