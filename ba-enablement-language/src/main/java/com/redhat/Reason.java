package com.redhat;

public class Reason {

	private String reasonMessage; // tell me what happened? was it null?

	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reasonMessage == null) ? 0 : reasonMessage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reason other = (Reason) obj;
		if (reasonMessage == null) {
			if (other.reasonMessage != null)
				return false;
		} else if (!reasonMessage.equals(other.reasonMessage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reason [reasonMessage=" + reasonMessage + "]";
	}

}