package shangbo.springbatch.example5;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.item.file.FlatFileFooterCallback;
import org.springframework.batch.item.file.FlatFileHeaderCallback;

public class MyFileItemWriter implements FlatFileFooterCallback, FlatFileHeaderCallback, ItemStreamWriter<People> {
	private ItemStreamWriter<People> delegate;
	private String header;
	private int totalLine = 0;

	// Override from FlatFileHeaderCallback
	@Override
	public void writeHeader(Writer writer) throws IOException {
		writer.write(header);
	}

	// Override from FlatFileFooterCallback
	@Override
	public void writeFooter(Writer writer) throws IOException {
		writer.write("Total line" + totalLine);

	}

	// Override from ItemStreamWriter
	@Override
	public void write(List<? extends People> items) throws Exception {
		totalLine += items.size();
		delegate.write(items);
	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		delegate.open(executionContext);

	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		delegate.update(executionContext);

	}

	@Override
	public void close() throws ItemStreamException {
		delegate.close();

	}

	// Setter
	public void setDelegate(ItemStreamWriter<People> delegate) {
		this.delegate = delegate;
	}

	public void setHeader(String header) {
		this.header = header;
	}

}
