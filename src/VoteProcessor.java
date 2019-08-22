import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int pope = 0;
		int edward =0;
		for(int i=0; i<votes.size(); i++) {
			 
			if(votes.get(i).equalsIgnoreCase("Pope Francis")) {
				pope = pope +1;
			}
			else if(votes.get(i).equalsIgnoreCase("EDWARD SNOWDEN")) {
				edward = edward + 1;
			}
		}
		if(pope > edward) {
			return "pope francis";
		}
		else if(pope==edward){
			return "TIE";
		}
		else {
			return "edward snowden";
		}
		
	}

}
