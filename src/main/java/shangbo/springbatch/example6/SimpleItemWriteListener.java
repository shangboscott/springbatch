package shangbo.springbatch.example6;

import java.util.List;

import org.springframework.batch.core.ItemWriteListener;

public class SimpleItemWriteListener implements ItemWriteListener<People> {

	@Override
	public void beforeWrite(List<? extends People> items) {
		System.out.println("SimpleItemWriteListener.beforeWrite");
	}

	@Override
	public void afterWrite(List<? extends People> items) {
		System.out.println("SimpleItemWriteListener.afterWrite");
	}

	@Override
	public void onWriteError(Exception exception, List<? extends People> items) {
		System.out.println("SimpleItemWriteListener.onWriteError");
	}

}
