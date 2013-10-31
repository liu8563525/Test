package ocjp2;

public class Item {
	private String desc;
	public String getDesc(){return desc;}
	public void setDesc(String d){
		desc=d;
	}
	public static void modifyDesc(Item item,String desc){
		item=new Item();
		item.setDesc(desc);
	}
	public static void main(String[] args) {
		Item item=new Item();
		item.setDesc("Gob");
		Item item2=new Item();
		item2.setDesc("Fiz");
		modifyDesc(item, "Scr");
		System.out.println(item.getDesc());
		System.out.println(item2.getDesc());
	}
}
