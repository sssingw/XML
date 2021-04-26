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
		
		String K15_seq = "";			//48시간 중 몇번째 인지 가르킴
		String K15_hour = "";			//동네예보 3시간 단위
		String K15_day = "";			//1번째날 (0: 오늘, 1: 내일, 2:모레)
		String K15_temp = "";			//현재 시간 온도
		String K15_tmx = ""; 			//최고 온도
		String K15_tmn = "";			//최저 온도
		String K15_sky = "";				//하늘 상태코드(1: 맑음, 2: 구름조금, 3: 구름많음. 4: 흐림)
		String K15_pty = "";				//강수 상태코드(0: 없음, 1:비, 2;비/눈, 3: 눈/비, 4:눈)
		String K15_wfKor = "";			//날씨 한국어
		String K15_wfen = "";			//날씨 영어
		String K15_pop = "";			//강수확률 %
		String K15_r12 = "";				//12시간 예상 강수량
		String K15_s12 = "";			//12시간 예상 적설량
		String K15_ws = "";				//풍속(m/s)
		String K15_wd = "";				//풍향(0~7:북, 북동, 동, 남동, 남, 남서, 서 ,북서)
		String K15_wdKor = "";		//풍향 한국어
		String K15_wdEn = "";			//풍향 영어
		String K15_reh = "";				//습도 %
		String K15_r06 = "";				//6시간 예상 강수량
		String K15_s06 = "";			//6시간 예상 적설량
		
		
		
		 DocumentBuilder K15_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		 Document K15_doc = K15_docBuilder.parse(new File ("C:\\Users\\성원\\Desktop\\pr09.xml"));
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
			
			System.out.println("48시간 중 " + K15_seq + "번째");
			System.out.println("시간 : " + K15_hour);
			System.out.println("날짜 : " + K15_w.dayDay(K15_day));
			System.out.println("현재 온도 : " + K15_temp);
			System.out.println("최고 온도 : " +K15_tmx);
			System.out.println("최저 온도 : " + K15_tmn);
			System.out.println("하늘 상태  : " + K15_w.skySky(K15_sky));
			System.out.println("강수 상태 : " +  K15_w.ptyPty(K15_pty));
			System.out.println("날씨(한국어) : " + K15_wfKor);
			System.out.println("날씨 : " + K15_wfen);
			System.out.println("강수 확률 : " + K15_pop);
			System.out.println("12시간 예상 강수량 : " + K15_r12);
			System.out.println("12시간 예상 적설량 : " + K15_s12);
			System.out.println("풍속 : " + K15_ws);
			System.out.println("풍향 : " +  K15_w.wdWD(K15_wd));
			System.out.println("풍향(한국어) : " + K15_wdKor);
			System.out.println("풍향 : " + K15_wdEn);
			System.out.println("습도 : " + K15_reh);
			System.out.println("6시간 예상 강수량 : " + K15_r06);
			System.out.println("6시간 예상 적설량 : " + K15_s06);
		}
	}
			public static String dayDay (String K15_day) {
				String day = " ";
				if (K15_day == "0") {
					day = "오늘";
				} else if (K15_day == "1") {
					day = "내일";
				} else if (K15_day == "2") {
					day = "모레";
				}
				return day;
			}
			public static String skySky (String K15_sky) {
				String sky = " ";
				if(K15_sky == "1") {
					sky = "맑음";
				}else if (K15_sky == "2") {
					sky = "구름 조금";
				}else if(K15_sky == "3") {
					sky = "구름 많음";				
				} 
				return sky;
			}
		 
			public static String ptyPty(String K15_pty) {
				String rain = " ";
				if (K15_pty == "0") {
					rain = "없음";
				}else if (K15_pty == "1") {
					rain = "비";
				}else if(K15_pty == "2") {
					rain = "비/눈";				
				} else if(K15_pty == "3") {
					rain = "눈/비";		
				}else if(K15_pty == "4") {
					rain = "눈";		
				} 
				return rain;		
	}
			public static String wdWD(String K15_wd) {
				String wd = " ";
				if (K15_wd == "0") {
					wd = "북";
				} else if (K15_wd == "1") {
					wd = "북동";
				} else if(K15_wd == "2") {
					wd = "동";				
				} else if(K15_wd == "3") {
					wd = "남동";		
				} else if(K15_wd == "4") {
					wd = "남";		
				}  else if(K15_wd == "5") {
					wd = "남서";		
				} else if(K15_wd == "6") {
					wd = "서";		
				} else if(K15_wd == "7") {
					wd = "북서";		
				}
				return wd;		
	}
}
	
