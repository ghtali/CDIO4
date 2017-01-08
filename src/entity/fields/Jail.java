package entity.fields;

import entity.GameBoard;
import entity.Player;
import entity.PlayerList;

public class Jail extends Field {

	/**
	 * Constructor for the Jail field, only takes a name.
	 * @param name
	 */
	public Jail(String name) {
		super(name);
	}

	@Override
	public boolean landOnField(Player player, int roll, GameBoard gameBoard, PlayerList playerList, boolean taxChoice) {
		player.setOnField(10);
		player.setPlayerInJail(true);
		return true;
	}
	
	// all methods under this line are default methods
	
	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public Player getOwner() {
		return null;
	}

	@Override
	public void setOwner(Player newOwner) {}

	@Override
	public int getRent(GameBoard gameBoard, int roll) {
		return 0;
	}

	@Override
	public boolean buyField(Player player) {
		return false;
	}

	@Override
	public boolean tradeField(Player seller, Player buyer, int price) {
		return false;
	}

	@Override
	public int getConstructionRate() {
		return 0;
	}

	@Override
	public int getConstructionPrice() {
		return 0;
	}

	@Override
	public int getPawnValue() {
		return 0;
	}

	@Override
	public int getPropertyGroup() {
		return 0;
	}

	@Override
	public boolean pawnField() {
		return false;
	}

	@Override
	public boolean undoPawnField() {
		return false;
	}

	@Override
	public boolean buildConstruction() {
		return false;
	}

	@Override
	public boolean sellConstruction() {
		return false;
	}

	@Override
	public boolean buyField(Player player, int price) {
		return false;
	}

	@Override
	public void releasePawnField() {}

	@Override
	public void setConstructionRate(int rate) {}

	@Override
	public boolean getIsPawned() {
		return false;
	}

	@Override
	public int getTopCardNumber() {
		return 0;
	}

	@Override
	public int getBonus() {
		return 0;
	}

	@Override
	public int getTaxAmount() {
		return 0;
	}

	@Override
	public int getTaxRate() {
		return 0;
	}

	@Override
	public int[] getRentArray() {
		return null;
	}
}
