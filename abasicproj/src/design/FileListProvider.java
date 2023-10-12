package design;

import java.io.File;

public interface FileListProvider {
	File[] getFiles();
}
class FileListFromFolderProvider implements FileListProvider
{
	@Override
	public File[] getFiles() {
		return null;
	}
}
interface FileAction
{
	Object actOnFile(File file);
}
class CancatenateAction implements FileAction
{
	String fileName;

	@Override
	public Object actOnFile(File file) {
		return null;
	}
	
}
interface ResultProcessor
{
	void processResult(File file, Object obj);
}
class MyAlgo
{
	FileListProvider fileListProvider;
	FileAction fileAction;
	ResultProcessor resultProcessor;
	
	public MyAlgo(FileListProvider fileListProvider, FileAction fileAction, ResultProcessor resultProcessor) {
		super();
		this.fileListProvider = fileListProvider;
		this.fileAction = fileAction;
		this.resultProcessor = resultProcessor;
	}

	public void processFiles()
	{
		File[] files = fileListProvider.getFiles();
		for(File file : files)
		{
			Object result = fileAction.actOnFile(file);
			resultProcessor.processResult(file, result);
		}
	}
}
