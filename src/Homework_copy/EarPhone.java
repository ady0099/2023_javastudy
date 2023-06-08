package Homework_copy;

public class EarPhone implements VolumeControllable {
	private int volume;

	public EarPhone() {
		this.volume = 3; // 기본값 3으로 설정
	}

	public void increaseVolume() {
		if (volume < 10) {
			volume++;
			System.out.println("EarPhone 볼륨 증가: " + volume);
		} else {
			System.out.println("더 이상 볼륨을 높일 수 없습니다.");
		}
	}

	public void decreaseVolume() {
		if (volume > 0) {
			volume--;
			System.out.println("EarPhone 볼륨 감소: " + volume);
		} else {
			System.out.println("더 이상 볼륨을 낮출 수 없습니다.");
		}
	}

	public void setVolume(int volume) {
		if (volume >= 0 && volume <= 10) {
			this.volume = volume;
			System.out.println("EarPhone 볼륨 설정: " + volume);
		} else {
			System.out.println("볼륨은 0부터 10 사이로 설정해야 합니다.");
		}
	}
}
