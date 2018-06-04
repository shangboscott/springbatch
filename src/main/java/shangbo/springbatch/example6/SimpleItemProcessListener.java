package shangbo.springbatch.example6;

import org.springframework.batch.core.ItemProcessListener;

public class SimpleItemProcessListener implements ItemProcessListener<People, People> {

	@Override
	public void beforeProcess(People item) {
		System.out.println("SimpleItemProcessListener.beforeProcess");
	}

	@Override
	public void afterProcess(People item, People result) {
		System.out.println("SimpleItemProcessListener.afterProcess -- " + result.getName());
	}

	@Override
	public void onProcessError(People item, Exception e) {
		System.out.println("SimpleItemProcessListener.onProcessError");
	}

}
