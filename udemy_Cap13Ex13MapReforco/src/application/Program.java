package application;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.next();
		// C:\\Users\\Bruno\\Desktop\\Java\\Eclipse-Workspace\\.metadata\\udemy_Cap13Ex13MapReforco\\in.txt

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> votes = new LinkedHashMap<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				} else {
					votes.put(name, count);
				}

				line = br.readLine();

			}
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}

		sc.close();
	}

}
