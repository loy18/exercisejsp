package javaio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T13DataIOStream {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("d:/D_Other/test.dat");
			
			// DataOutputStream은 출력용 데이터를 자료형에 맞게 출력
			dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");	// 문자열 데이터 출력(UTF-8)
			dos.writeInt(17);		// 정수형으로 데이터 출력
			dos.writeFloat(3.14f);		// 실수형(float)으로로 데이터 출력
			dos.writeDouble(3.14);		// 실수형(double)으로 데이터 출력
			dos.writeBoolean(true);		// 논리형으로 데이터 출력
			
			System.out.println("출력 완료...");
			
			// ================================================
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 출력한 자료 읽어오기
//		FileInputStream fis = null;
//		DataInputStream dis = null;
		
		try(FileInputStream fis = new FileInputStream("d:/D_Other/test.dat");
				DataInputStream dis = new DataInputStream(fis);) {
			
			System.out.println("문자열 자료: " + dis.readUTF());
			System.out.println("정수형 자료: " + dis.readInt());
			System.out.println("실수형(Float) 자료: " 
									+ dis.readFloat());
			System.out.println("실수형(Double) 자료: "
					+ dis.readDouble());
			System.out.println("논리형 자료: " + dis.readBoolean());
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
