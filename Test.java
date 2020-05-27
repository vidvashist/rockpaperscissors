package Adventure;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {

		boolean playAgain = false;
		String play = "";
		ImageIcon rock = new ImageIcon("rock.gif");
		ImageIcon paper = new ImageIcon("paper.gif");
		ImageIcon scissors = new ImageIcon("scissors.gif");

		int computer = RockPaperScissors.choose();

		do {
			String answer = JOptionPane.showInputDialog("Rock, Paper or Scissors?");
			answer = answer.toLowerCase();
			
			if(computer == 1) {
				JOptionPane.showMessageDialog(null, "Computer chose rock", answer, computer, rock);
			}
			else if(computer == 2) {
				JOptionPane.showMessageDialog(null, "Computer chose paper", answer, computer, paper);
			}
			else {
				JOptionPane.showMessageDialog(null, "Computer chose scissors", answer, computer, scissors);
			}

			if(answer.equals("rock")) {

				if(computer == 1) {
					JOptionPane.showMessageDialog(null, "Draw!");
					//break;
				}else if(computer == 2) {

					JOptionPane.showMessageDialog(null, "Paper beats rock! You lose.");
					//break;
				}
				else {

					JOptionPane.showMessageDialog(null, "Rock beats scissors! You win");
					//break;
				}
			}

			else if(answer.equals("paper")) {
				if(computer == 1) {

					JOptionPane.showMessageDialog(null, "Paper beats rock! You win");
					//break;
				}else if(computer == 2) {
					JOptionPane.showMessageDialog(null, "Draw");
					//break;
				}
				else {

					JOptionPane.showMessageDialog(null, "Scissors beats paper! You lose");
					//break;
				}
			}

			else if((answer.equals("scissors"))) {
				if(computer == 1) {

					JOptionPane.showMessageDialog(null, "Rock beats scissors! You lose");
					//break;

				}else if(computer == 2) {

					JOptionPane.showMessageDialog(null, "Scissors beats paper! You win");
					//break;
				}
				else {
					JOptionPane.showMessageDialog(null, "Draw");
					//break;
				}
			}


			play = JOptionPane.showInputDialog("Play again? Enter Y or N.");
			if(play.equals("Y") || play.equals("y")) {
				playAgain = true;
			}
			else if(play.equals("n") || play.equals("N")){
				playAgain = false;
				break;
			}

			computer = RockPaperScissors.choose();

		}while(playAgain = true);
	}

}
