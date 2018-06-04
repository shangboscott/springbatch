package shangbo.springbatch.example6;

import org.springframework.batch.core.SkipListener;

public class SimpleSkipListener implements SkipListener<String, People> {

	@Override
	public void onSkipInRead(Throwable t) {
		System.out.println("SimpleSkipListener.onSkipInRead");
	}

	@Override
	public void onSkipInWrite(People item, Throwable t) {
		System.out.println("SimpleSkipListener.onSkipInWrite");
	}

	@Override
	public void onSkipInProcess(String item, Throwable t) {
		System.out.println("SimpleSkipListener.onSkipInProcess");
	}

}
