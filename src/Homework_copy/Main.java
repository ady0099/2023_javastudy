package Homework_copy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VolumeControllable tv = new Television();
		VolumeControllable speaker = new Speaker();
		VolumeControllable earphone = new EarPhone();

		Scanner scanner = new Scanner(System.in);
		int deviceChoice = 0;

		while (deviceChoice != 4) {
			System.out.println("=== 디바이스 선택 ===");
			System.out.println("1. TV");
			System.out.println("2. 스피커");
			System.out.println("3. 이어폰");
			System.out.println("4. 종료");
			System.out.print("디바이스를 선택하세요: ");

			deviceChoice = scanner.nextInt();

			VolumeControllable selectedDevice;
			if (deviceChoice == 1) {
				selectedDevice = tv;
			} else if (deviceChoice == 2) {
				selectedDevice = speaker;
			} else if (deviceChoice == 3) {
				selectedDevice = earphone;
			} else if (deviceChoice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요.");
				continue;
			}

			int volumeChoice = 0;

			while (volumeChoice != 4) {
				System.out.println("=== 볼륨 조절 ===");
				System.out.println("1. 볼륨 증가");
				System.out.println("2. 볼륨 감소");
				System.out.println("3. 볼륨 설정");
				System.out.println("4. 이전 메뉴로 돌아가기");
				System.out.print("메뉴를 선택하세요: ");

				volumeChoice = scanner.nextInt();

				switch (volumeChoice) {
				case 1:
					selectedDevice.increaseVolume();
					break;
				case 2:
					selectedDevice.decreaseVolume();
					break;
				case 3:
					System.out.print("설정할 볼륨을 입력하세요: ");
					int volume = scanner.nextInt();
					selectedDevice.setVolume(volume);
					break;
				case 4:
					System.out.println("이전 메뉴로 돌아갑니다.");
					break;
				default:
					System.out.println("유효하지 않은 메뉴입니다. 다시 선택해주세요.");
					break;
				}

				System.out.println();
			}
		}

		scanner.close();
	}
}