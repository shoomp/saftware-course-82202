package a;

public class GymStatistic {

	private static double mIncome;

	private static double charges;

	public GymStatistic() {
	}

	static GymStatistic statistic = new GymStatistic();

	public static double getmIncome(Gym gym) {

		for (Classroom c : Gym.getClasses()) {
			if (c != null) {
				for (Member m : c.getMembers()) {
					if (m != null) {
						mIncome += m.getMonthlyPayment();
					}
				}
			}
		}
		return mIncome;
	}

	public static double getCharges(Gym gym) {

		for (Classroom c : Gym.getClasses()) {
			charges += c.getTr().getSalary();
		}
		return charges;
	}

}
