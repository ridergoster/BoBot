package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class AuRevoirCell implements SmartCell {

	@Override
	public String ask(String question) {
		if(question.contains("Au revoir"))
		  return "Au revoir!";
		else
		  return null;
	}

}
