package complexjavaobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleListMain {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		SampleArrayList samplearray = new SampleArrayList();

		SampleArrayList samplesecond = new SampleArrayList();

		List<SampleArrayList> list = new ArrayList<SampleArrayList>();

		samplearray.setFirstName("Yakubu");
		samplearray.setLastName("Bisiss");
		samplearray.setPhoneNumber(06);
		samplearray.setId(2);

		samplesecond.setFirstName("Tayoos");
		samplesecond.setLastName("Kehinde");
		samplesecond.setId(1);

		list.add(samplearray);
		list.add(samplesecond);
		// for (SampleArrayList sortingout : list)

		for (int i = 0; i < list.size(); i++) {

			SampleArrayList sample = (SampleArrayList) list.get(i);

			System.out.println("UserId :" + sample.getId() + "||"
					+ "User FirstName:" + sample.getFirstName());

			Collections.sort(list, new SortingUserDetails());
		}

	}

}
