package pr09;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class pr_01 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {	
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//�ľ��� ���� �غ�
		Document doc = docBuilder.parse(new File("C:\\Users\\����\\Desktop\\pr.xml"));
		//xml������ ó���ϱ� ���� �ش� ������ ��ġ ����
		Element root = doc.getDocumentElement();
		//root�±׸� ������ �ͼ� ó����
		
		NodeList K15_tag_name = doc.getElementsByTagName("name");
		//dom �ļ��� �б�, �������̽��� nodelist�� ���, name�� ������ ��
		NodeList K15_tag_studentid = doc.getElementsByTagName("studentid");
		//dom �ļ��� �б�, �������̽��� nodelist�� ���, studentid�� ������ ��
		NodeList K15_tag_kor = doc.getElementsByTagName("kor");
		//dom �ļ��� �б�, �������̽��� nodelist�� ���, kor�� ������ ��
		NodeList K15_tag_eng = doc.getElementsByTagName("eng");
		//dom �ļ��� �б�, �������̽��� nodelist�� ���, eng�� ������ ��
		NodeList K15_ta_mat = doc.getElementsByTagName("mat");
		//dom �ļ��� �б�, �������̽��� nodelist�� ���, mat�� ������ ��			
		System.out.printf("***********************************************\n");
		//�ٶ���� ���� ���
		for(int K15_i = 0; K15_i < K15_tag_name.getLength(); K15_i++) {														//K15_tag_name�� ���̸�ŭ �ݺ�
			System.out.printf("�̸� : %s\n", K15_tag_name.item(K15_i).getFirstChild().getNodeValue());			//�̸��� ��� 
			System.out.printf("�й� : %s\n", K15_tag_studentid.item(K15_i).getFirstChild().getNodeValue());	//�й��� ���
			System.out.printf("���� : %s\n", K15_tag_kor.item(K15_i).getFirstChild().getNodeValue());				//��� ���
			System.out.printf("���� : %s\n", K15_tag_eng.item(K15_i).getFirstChild().getNodeValue());			//��� ���
			System.out.printf("���� : %s\n", K15_ta_mat.item(K15_i).getFirstChild().getNodeValue());				//������ ���
			System.out.printf("**********************************************************\n");	//�ٶ���� ���� ���
		}

	}

}
