package thread;

public class VoteThreadMain {
	public static void main(String[] args) {
		
		VoteThreadClass voteLocation1 = new VoteThreadClass();
		VoteThreadClass voteLocation2 = new VoteThreadClass();
		VoteThreadClass voteLocation3 = new VoteThreadClass();
		
		Thread location1 = new Thread(voteLocation1, "서울");
		Thread location2 = new Thread(voteLocation2, "부산");
		Thread location3 = new Thread(voteLocation3, "전주");
		
		location1.start();
		location2.start();
		location3.start();
	}
	
}
