package Task04;

//4. ��� ������ �������� ��������� �������� ���������, 
//������� �������� true, ���� ����� � ������������ (�, �) ����������� ����������� �������, 
//� false � � ��������� ������:

public class ClassTask4 {

	public static boolean checkAreaAndPoints(double x, double y) {
		if (((x >= -4) && (x <= 4) && (y >= -3) && (y <= 0))
				|| ((x >= -2) && (x <= 2) && (y >= 0) && (y <= -4))) {
			return true;
		} else {
			return false;

		}

	}

}
