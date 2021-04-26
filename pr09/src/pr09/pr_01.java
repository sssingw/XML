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
		//파씽을 위한 준비
		Document doc = docBuilder.parse(new File("C:\\Users\\성원\\Desktop\\pr.xml"));
		//xml파일을 처리하기 위해 해당 파일의 위치 지정
		Element root = doc.getDocumentElement();
		//root태그를 가지고 와서 처리함
		
		NodeList K15_tag_name = doc.getElementsByTagName("name");
		//dom 파서로 읽기, 인터페이스인 nodelist를 사용, name을 가지고 옴
		NodeList K15_tag_studentid = doc.getElementsByTagName("studentid");
		//dom 파서로 읽기, 인터페이스인 nodelist를 사용, studentid을 가지고 옴
		NodeList K15_tag_kor = doc.getElementsByTagName("kor");
		//dom 파서로 읽기, 인터페이스인 nodelist를 사용, kor을 가지고 옴
		NodeList K15_tag_eng = doc.getElementsByTagName("eng");
		//dom 파서로 읽기, 인터페이스인 nodelist를 사용, eng을 가지고 옴
		NodeList K15_ta_mat = doc.getElementsByTagName("mat");
		//dom 파서로 읽기, 인터페이스인 nodelist를 사용, mat을 가지고 옴			
		System.out.printf("***********************************************\n");
		//줄띄움을 위해 출력
		for(int K15_i = 0; K15_i < K15_tag_name.getLength(); K15_i++) {														//K15_tag_name의 길이만큼 반복
			System.out.printf("이름 : %s\n", K15_tag_name.item(K15_i).getFirstChild().getNodeValue());			//이름을 출력 
			System.out.printf("학번 : %s\n", K15_tag_studentid.item(K15_i).getFirstChild().getNodeValue());	//학번을 출력
			System.out.printf("국어 : %s\n", K15_tag_kor.item(K15_i).getFirstChild().getNodeValue());				//국어를 출력
			System.out.printf("영어 : %s\n", K15_tag_eng.item(K15_i).getFirstChild().getNodeValue());			//영어를 출력
			System.out.printf("수학 : %s\n", K15_ta_mat.item(K15_i).getFirstChild().getNodeValue());				//수학을 출력
			System.out.printf("**********************************************************\n");	//줄띄움을 위해 출력
		}

	}

}
