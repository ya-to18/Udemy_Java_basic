class jihan2{
	public static void main (String[] args) {
		int sum = 0;
		int change = 0;
		for(int i = 0; i < args.length; i++) {
			int price = Integer.parseInt(args[i]);
			
			if(i + 1 == args.length) {
				change = sum - price;
				break;
			}

			switch(price) {
			case 10:
				sum += price;
				break;
			case 50:
				sum += price;
				break;
			case 100:
				sum += price;
				break;
			case 500:
				sum+= price;
				break;
			case 1:
				System.out.println("警告：１円玉は使えません");
				break;
			case 5:
				System.out.println("警告：5円玉は使えません");
				break;
			default:
				System.out.println("警告：" + price + "は硬貨として適切な値ではありません");
				break;
			}
		}
		
		System.out.println(change + "円のお釣りです。ありがとうございました。");
	}
}