package complexjavaobject;

import java.util.Comparator;

public class SortingUserDetails implements Comparator<SampleArrayList> {

	@Override
	public int compare(SampleArrayList sampleid, SampleArrayList samplelast) {

		return (sampleid.getId() < samplelast.getId()) ? -1
				: (sampleid.getId() > samplelast.getId()) ? 1 : 0;

	}

}
