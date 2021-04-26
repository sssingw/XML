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

public class weather {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		weather K15_w = new weather();
		
		String K15_seq = "";			//48�ð� �� ���° ���� ����Ŵ
		String K15_hour = "";			//���׿��� 3�ð� ����
		String K15_day = "";			//1��°�� (0: ����, 1: ����, 2:��)
		String K15_temp = "";			//���� �ð� �µ�
		String K15_tmx = ""; 			//�ְ� �µ�
		String K15_tmn = "";			//���� �µ�
		String K15_sky = "";				//�ϴ� �����ڵ�(1: ����, 2: ��������, 3: ��������. 4: �帲)
		String K15_pty = "";				//���� �����ڵ�(0: ����, 1:��, 2;��/��, 3: ��/��, 4:��)
		String K15_wfKor = "";			//���� �ѱ���
		String K15_wfen = "";			//���� ����
		String K15_pop = "";			//����Ȯ�� %
		String K15_r12 = "";				//12�ð� ���� ������
		String K15_s12 = "";			//12�ð� ���� ������
		String K15_ws = "";				//ǳ��(m/s)
		String K15_wd = "";				//ǳ��(0~7:��, �ϵ�, ��, ����, ��, ����, �� ,�ϼ�)
		String K15_wdKor = "";		//ǳ�� �ѱ���
		String K15_wdEn = "";			//ǳ�� ����
		String K15_reh = "";				//���� %
		String K15_r06 = "";				//6�ð� ���� ������
		String K15_s06 = "";			//6�ð� ���� ������
		
		
		
		 DocumentBuilder K15_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		 Document K15_doc = K15_docBuilder.parse(new File ("C:\\Users\\����\\Desktop\\pr09.xml"));
		NodeList K15_tag001 = K15_doc.getElementsByTagName("data");
		for (int K15_i = 0; K15_i < K15_tag001.getLength(); K15_i++) {
			Element K15_elmt = (Element)K15_tag001.item(K15_i);
			if(K15_doc.)
			
			K15_seq = K15_tag001.item(K15_i).getAttributes().getNamedItem("seq").getNodeValue();
			K15_hour = K15_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			K15_day = K15_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();			
			K15_temp = K15_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			K15_tmx = K15_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			K15_tmn = K15_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			K15_sky = K15_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			K15_pty = K15_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			K15_wfKor = K15_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			K15_wfen = K15_elmt.getElementsByTagName("wfen").item(0).getFirstChild().getNodeValue();
			K15_pop = K15_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			K15_r12 = K15_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			K15_s12 = K15_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			K15_ws = K15_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			K15_wd = K15_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			K15_wdKor = K15_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			K15_wdEn = K15_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			K15_reh = K15_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			K15_r06 = K15_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			K15_s06 = K15_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			
			System.out.println("48�ð� �� " + K15_seq + "��°");
			System.out.println("�ð� : " + K15_hour);
			System.out.println("��¥ : " + K15_w.dayDay(K15_day));
			System.out.println("���� �µ� : " + K15_temp);
			System.out.println("�ְ� �µ� : " +K15_tmx);
			System.out.println("���� �µ� : " + K15_tmn);
			System.out.println("�ϴ� ����  : " + K15_w.skySky(K15_sky));
			System.out.println("���� ���� : " +  K15_w.ptyPty(K15_pty));
			System.out.println("����(�ѱ���) : " + K15_wfKor);
			System.out.println("���� : " + K15_wfen);
			System.out.println("���� Ȯ�� : " + K15_pop);
			System.out.println("12�ð� ���� ������ : " + K15_r12);
			System.out.println("12�ð� ���� ������ : " + K15_s12);
			System.out.println("ǳ�� : " + K15_ws);
			System.out.println("ǳ�� : " +  K15_w.wdWD(K15_wd));
			System.out.println("ǳ��(�ѱ���) : " + K15_wdKor);
			System.out.println("ǳ�� : " + K15_wdEn);
			System.out.println("���� : " + K15_reh);
			System.out.println("6�ð� ���� ������ : " + K15_r06);
			System.out.println("6�ð� ���� ������ : " + K15_s06);
		}
	}
			public static String dayDay (String K15_day) {
				String day = " ";
				if (K15_day == "0") {
					day = "����";
				} else if (K15_day == "1") {
					day = "����";
				} else if (K15_day == "2") {
					day = "��";
				}
				return day;
			}
			public static String skySky (String K15_sky) {
				String sky = " ";
				if(K15_sky == "1") {
					sky = "����";
				}else if (K15_sky == "2") {
					sky = "���� ����";
				}else if(K15_sky == "3") {
					sky = "���� ����";				
				} 
				return sky;
			}
		 
			public static String ptyPty(String K15_pty) {
				String rain = " ";
				if (K15_pty == "0") {
					rain = "����";
				}else if (K15_pty == "1") {
					rain = "��";
				}else if(K15_pty == "2") {
					rain = "��/��";				
				} else if(K15_pty == "3") {
					rain = "��/��";		
				}else if(K15_pty == "4") {
					rain = "��";		
				} 
				return rain;		
	}
			public static String wdWD(String K15_wd) {
				String wd = " ";
				if (K15_wd == "0") {
					wd = "��";
				} else if (K15_wd == "1") {
					wd = "�ϵ�";
				} else if(K15_wd == "2") {
					wd = "��";				
				} else if(K15_wd == "3") {
					wd = "����";		
				} else if(K15_wd == "4") {
					wd = "��";		
				}  else if(K15_wd == "5") {
					wd = "����";		
				} else if(K15_wd == "6") {
					wd = "��";		
				} else if(K15_wd == "7") {
					wd = "�ϼ�";		
				}
				return wd;		
	}
}
	
