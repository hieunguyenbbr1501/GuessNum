import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word source = new Word("data.txt");
		ArrayList<String> list = source.createWordList();
		System.out.println("Từ điển A-V");
		System.out.println("Gõ: \n1.Dịch từ: để dịch.\n2.Xóa từ: để xóa.\n3.Sửa từ: để sửa.\n4.Thêm từ: để thêm.\n5.Danh sách từ: để in các từ có sẵn. ");
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		String command = new String();
		command = scanner.nextLine();
		while(command!="Thoát")
		{
			if(command.equals("Dịch từ"))
			{
					System.out.println("Nhập từ bạn cần dịch: ");
					String word = scanner.nextLine();
					if(list.contains(word))
					{
						String pronounce = source.getPronounce(word);
						System.out.println(pronounce);
						String meaning = source.getMeaning(word);
						System.out.println(meaning);
						
						continue;
					}
					else if(word.equals("Quay lại"))
					{	
						String tempcommand = scanner.nextLine();
						command = tempcommand;
					}
					else
					{
						System.out.println("Từ không sẵn có. Vui lòng thêm từ mới!");
						
						continue;
					}
				
			}
				
			if(command.equals("Xóa từ"))
			{
				System.out.println("Nhập từ bạn cần xóa: ");
				String word = scanner.nextLine();
				if(list.contains(word))
				{
					source.removeword(word);
					System.out.println("Từ đã được xóa thành công.");
					command = scanner.nextLine();
				}
				
				else
				{
					System.out.println("Từ không sẵn có, không cần xóa!");
					command = scanner.nextLine();
				}
			}
			if(command.equals("Sửa từ"))
			{
				System.out.println("Nhập từ bạn cần sửa: ");
				String word = scanner.nextLine();
				if(list.contains(word))
				{
					String pronounce = new String();
					String meaning = new String();
					ArrayList<String> fixedword = new ArrayList<String>();
					System.out.println("Phát âm cần sửa(Nếu không sửa không cần ghi gì): ");
					String temppronounce = scanner.nextLine();
					pronounce = (temppronounce.equals(""))? source.getPronounce(word) : temppronounce;
					fixedword.add(pronounce);
					System.out.println("Nghĩa cần sửa(Nếu không sửa không cần ghi gì): ");
					String tempmeaning = scanner.nextLine();
					meaning = (tempmeaning.equals(""))? source.getMeaning(word) : tempmeaning;
					fixedword.add(meaning);
					source.fixword(word, fixedword);
					System.out.println("Sửa từ thành công!");
					
					continue;
				}
				else if(word.equals("Quay lại"))
				{	
					list=source.createWordList();
					String tempcommand = scanner.nextLine();
					command = tempcommand;
				}
				else
				{
					System.out.print("Từ không sẵn có. Sửa thất bại");
					
					continue;
				}
			}
			if(command.equals("Thêm từ"))
			{	System.out.println("Nhập từ cần thêm");
				String word = scanner.nextLine();
				if(list.contains(word))
				{
					System.out.println("Từ đã có sẵn!");
					
					continue;
				}
				else if(word.equals("Quay lại"))
				{	
					list = source.createWordList();
					String tempcommand = scanner.nextLine();
					command = tempcommand;
				}
				else {
					
					ArrayList<String> addlist = new ArrayList<>();
					System.out.println("Nhập phát âm:");
					String pronounce = scanner.nextLine();
					System.out.println("Nhập nghĩa của từ:");
					String meaning = scanner.nextLine();
					addlist.add(word);
					addlist.add(pronounce);
					addlist.add(meaning);
					source.addWord(addlist);
					
					continue;
				}
			}
			if(command.equals("Danh sách từ"))
			{
				for(int i=0;i<list.size();i++)
				{
					System.out.println(i+": "+list.get(i)+ " "+source.getPronounce(list.get(i))+"\n"+source.getMeaning(list.get(i)));
				}
				String tempcommand = scanner.nextLine();
				command = tempcommand;
			}
		}
		scanner.close();
	}

}
