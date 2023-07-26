package Test_Server;

import java.io.Serializable;
import java.util.List;

import Test_DB.VO;

public class Protocol implements Serializable{
	private static final long serialVersionUID = 100L;
	// 1.전체보기
	int cmd;
	int result ;
	List<VO> list;
	VO vo ;
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public List<VO> getList() {
		return list;
	}
	public void setList(List<VO> list) {
		this.list = list;
	}
	public VO getVo() {
		return vo;
	}
	public void setVo(VO vo) {
		this.vo = vo;
	}
	
}
