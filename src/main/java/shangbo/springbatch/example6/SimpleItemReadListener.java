package shangbo.springbatch.example6;

import org.springframework.batch.core.ItemReadListener;

public class SimpleItemReadListener implements ItemReadListener<People> {

	@Override
	public void beforeRead() {
		System.out.println("SimpleItemReadListener.beforeRead");
	}

	@Override
	public void afterRead(People item) {
		System.out.println("SimpleItemReadListener.afterRead -- " + item.getName());
	}

	@Override
	public void onReadError(Exception ex) {
		System.out.println("SimpleItemReadListener.onReadError");
	}

}
