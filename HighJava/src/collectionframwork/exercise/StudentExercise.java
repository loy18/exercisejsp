package collectionframwork.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentExercise {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(220001,"김태훈",100,100,100));
		list.add(new Student(220005,"안하용",0,0,0));
		list.add(new Student(220002,"개똥이",80,70,60));
		list.add(new Student(220006,"소똥이",50,50,50));
		list.add(new Student(220008,"말똥이",100,50,50));
		list.add(new Student(220003,"닭똥이",100,50,50));
		list.add(new Student(220004,"이똥이",100,100,0));
		list.add(new Student(220009,"안똥이",10,10,10));
		list.add(new Student(220007,"돼똥이",0,0,100));
		
		StudentCompare.rank(list);
		for(Student s : list) {
			System.out.println(s);
		}
		
		Collections.sort(list, new StudentCompare());
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("총점 정렬");
		for(Student s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("등수 입력");
		StudentCompare.denseRank(list);
		for(Student s : list) {
			System.out.println(s);
		}
	}
}



class StudentCompare implements Comparator<Student>{
	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1.getTotalScore() > stu2.getTotalScore()) {
			return -1;
		} else if(stu1.getTotalScore() == stu2.getTotalScore()) {
			return stu1.compareTo(stu2) * -1;
		} else {
			return 1;
		}
	}
	
	//별도로 정렬안하고 등수 입력가능
	public static void rank(List<Student> list) {
		List<Student> rankList = new ArrayList<>(list);
		Collections.sort(rankList, new StudentCompare());
		int same = 0;
		int rank = 0;
		for(Student s : rankList) {
			if(s.getTotalScore() == same) {
				s.setRanking(rank);
			}else {
				s.setRanking(++rank);
				same = s.getTotalScore();
			}
		}
	}
	
	public static void denseRank(List<Student> list) {
		List<Student> rankList = new ArrayList<>(list);
		Collections.sort(rankList, new StudentCompare());
		int same = 0;
		int rank = 0;
		int overlap = 0;
		for(Student s : rankList) {
			if(s.getTotalScore() == same) {
				s.setRanking(rank);
				overlap++;
			}else {
				rank += overlap;
				s.setRanking(++rank);
				same = s.getTotalScore();
				overlap = 0;
			}
		}
	}
	
}

class Student implements Comparable<Student>{
	private int studentNum;
	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	private int totalScore;
	private int ranking;
	public Student(int studentNum, String name, int koreanScore, int englishScore, int mathScore) {
		this.studentNum = studentNum;
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.totalScore = koreanScore + englishScore + mathScore;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	@Override
	public int compareTo(Student o) {
		return new Integer(this.studentNum).compareTo(o.getStudentNum());
	}
	@Override
	public String toString() {
		return String.format(
				"studentNum=%s, name=%s, koreanScore=%s, englishScore=%s, mathScore=%s, totalScore=%s, ranking=%s",
				studentNum, name, koreanScore, englishScore, mathScore, totalScore, ranking);
	}
	
}