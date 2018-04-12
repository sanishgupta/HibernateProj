import java.io.Serializable;
import java.util.Date;


public class RetailTransaction implements Serializable
{
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	
	private long sequenceId;

	/**
	 * @return the id
	 */
	public long getSequenceId()
	{
		return sequenceId;
	}

	/**
	 * @param id the id to set
	 */
	public void setSequenceId(long sequenceId)
	{
		this.sequenceId = sequenceId;
	}

	private String	retailStoreID					= "";
	private String	workstationID					= "";
	private String	businessDayDate					= "";
	private int		transactionSequenceNumber;
	private String	operatorID						= "";
	private String	transactionTypeCode				= "";
	private Date	workstationStartDateTimestamp	= null;
	private Date	beginDateTimestamp				= null;
	private Date	endDateTimestamp				= null;
	private String	trainingFlag					= "";
	private String	keyedOfflineFlag				= "";
	private short	transactionStatusCode;
	private String	salesAssociateIDEmployeeID		= "";
	private String	customerInfo					= "";
	private short	customerInfoType;
	private String	tenderRepositoryID				= "";
	private int		currencyID;
	private int		transactionTLogBatchID;
	private String	transactionArchiveBatchID		= "";
	private String	transactionRTLogBatchID			= "";
	private String	inventoryReservationBatchID		= "";
	private short	transactionPostProcessingStatusCode;
	private String	transactionReentryFlag			= "";
	private String	salesAssociateModifiedFlag		= "";
	private Date	recordCreatedTimestamp;
	private Date	recordLastModifiedTimestamp;
	private String	taxExemptFlag					= "";

	public String getRetailStoreID()
	{
		return retailStoreID;
	}

	public void setRetailStoreID(String retailStoreID)
	{
		this.retailStoreID = retailStoreID;
	}

	public String getWorkstationID()
	{
		return workstationID;
	}

	public void setWorkstationID(String workstationID)
	{
		this.workstationID = workstationID;
	}

	public String getBusinessDayDate()
	{
		return businessDayDate;
	}

	public void setBusinessDayDate(String businessDayDate)
	{
		this.businessDayDate = businessDayDate;
	}

	public int getTransactionSequenceNumber()
	{
		return transactionSequenceNumber;
	}

	public void setTransactionSequenceNumber(int transactionSequenceNumber)
	{
		this.transactionSequenceNumber = transactionSequenceNumber;
	}

	public String getOperatorID()
	{
		return operatorID;
	}

	public void setOperatorID(String operatorID)
	{
		this.operatorID = operatorID;
	}

	public String getTransactionTypeCode()
	{
		return transactionTypeCode;
	}

	public void setTransactionTypeCode(String transactionTypeCode)
	{
		this.transactionTypeCode = transactionTypeCode;
	}

	public Date getWorkstationStartDateTimestamp()
	{
		return workstationStartDateTimestamp;
	}

	public void setWorkstationStartDateTimestamp(Date workstationStartDateTimestamp)
	{
		this.workstationStartDateTimestamp = workstationStartDateTimestamp;
	}

	public Date getBeginDateTimestamp()
	{
		return beginDateTimestamp;
	}

	public void setBeginDateTimestamp(Date beginDateTimestamp)
	{
		this.beginDateTimestamp = beginDateTimestamp;
	}

	public Date getEndDateTimestamp()
	{
		return endDateTimestamp;
	}

	public void setEndDateTimestamp(Date endDateTimestamp)
	{
		this.endDateTimestamp = endDateTimestamp;
	}

	public String getTrainingFlag()
	{
		return trainingFlag;
	}

	public void setTrainingFlag(String trainingFlag)
	{
		this.trainingFlag = trainingFlag;
	}

	public String getKeyedOfflineFlag()
	{
		return keyedOfflineFlag;
	}

	public void setKeyedOfflineFlag(String keyedOfflineFlag)
	{
		this.keyedOfflineFlag = keyedOfflineFlag;
	}

	public short getTransactionStatusCode()
	{
		return transactionStatusCode;
	}

	public void setTransactionStatusCode(short transactionStatusCode)
	{
		this.transactionStatusCode = transactionStatusCode;
	}

	public String getSalesAssociateIDEmployeeID()
	{
		return salesAssociateIDEmployeeID;
	}

	public void setSalesAssociateIDEmployeeID(String salesAssociateIDEmployeeID)
	{
		this.salesAssociateIDEmployeeID = salesAssociateIDEmployeeID;
	}

	public String getCustomerInfo()
	{
		return customerInfo;
	}

	public void setCustomerInfo(String customerInfo)
	{
		this.customerInfo = customerInfo;
	}

	public short getCustomerInfoType()
	{
		return customerInfoType;
	}

	public void setCustomerInfoType(short customerInfoType)
	{
		this.customerInfoType = customerInfoType;
	}

	public String getTenderRepositoryID()
	{
		return tenderRepositoryID;
	}

	public void setTenderRepositoryID(String tenderRepositoryID)
	{
		this.tenderRepositoryID = tenderRepositoryID;
	}

	public int getCurrencyID()
	{
		return currencyID;
	}

	public void setCurrencyID(int currencyID)
	{
		this.currencyID = currencyID;
	}

	public int getTransactionTLogBatchID()
	{
		return transactionTLogBatchID;
	}

	public void setTransactionTLogBatchID(int transactionTLogBatchID)
	{
		this.transactionTLogBatchID = transactionTLogBatchID;
	}

	public String getTransactionArchiveBatchID()
	{
		return transactionArchiveBatchID;
	}

	public void setTransactionArchiveBatchID(String transactionArchiveBatchID)
	{
		this.transactionArchiveBatchID = transactionArchiveBatchID;
	}

	public String getTransactionRTLogBatchID()
	{
		return transactionRTLogBatchID;
	}

	public void setTransactionRTLogBatchID(String transactionRTLogBatchID)
	{
		this.transactionRTLogBatchID = transactionRTLogBatchID;
	}

	public String getInventoryReservationBatchID()
	{
		return inventoryReservationBatchID;
	}

	public void setInventoryReservationBatchID(String inventoryReservationBatchID)
	{
		this.inventoryReservationBatchID = inventoryReservationBatchID;
	}

	public short getTransactionPostProcessingStatusCode()
	{
		return transactionPostProcessingStatusCode;
	}

	public void setTransactionPostProcessingStatusCode(short transactionPostProcessingStatusCode)
	{
		this.transactionPostProcessingStatusCode = transactionPostProcessingStatusCode;
	}

	public String getTransactionReentryFlag()
	{
		return transactionReentryFlag;
	}

	public void setTransactionReentryFlag(String transactionReentryFlag)
	{
		this.transactionReentryFlag = transactionReentryFlag;
	}

	public String getSalesAssociateModifiedFlag()
	{
		return salesAssociateModifiedFlag;
	}

	public void setSalesAssociateModifiedFlag(String salesAssociateModifiedFlag)
	{
		this.salesAssociateModifiedFlag = salesAssociateModifiedFlag;
	}

	public Date getRecordCreatedTimestamp()
	{
		return recordCreatedTimestamp;
	}

	public void setRecordCreatedTimestamp(Date recordCreatedTimestamp)
	{
		this.recordCreatedTimestamp = recordCreatedTimestamp;
	}

	public Date getRecordLastModifiedTimestamp()
	{
		return recordLastModifiedTimestamp;
	}

	public void setRecordLastModifiedTimestamp(Date recordLastModifiedTimestamp)
	{
		this.recordLastModifiedTimestamp = recordLastModifiedTimestamp;
	}

	public String getTaxExemptFlag()
	{
		return taxExemptFlag;
	}

	public void setTaxExemptFlag(String taxExemptFlag)
	{
		this.taxExemptFlag = taxExemptFlag;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessDayDate == null) ? 0 : businessDayDate.hashCode());
		result = prime * result + ((retailStoreID == null) ? 0 : retailStoreID.hashCode());
		result = prime * result + transactionSequenceNumber;
		result = prime * result + ((workstationID == null) ? 0 : workstationID.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if ( this == obj )
		{
			return true;
		}
		if ( obj == null )
		{
			return false;
		}
		if ( !(obj instanceof RetailTransaction) )
		{
			return false;
		}
		RetailTransaction other = (RetailTransaction) obj;
		if ( businessDayDate == null )
		{
			if ( other.businessDayDate != null )
			{
				return false;
			}
		}
		else if ( !businessDayDate.equals(other.businessDayDate) )
		{
			return false;
		}
		if ( retailStoreID == null )
		{
			if ( other.retailStoreID != null )
			{
				return false;
			}
		}
		else if ( !retailStoreID.equals(other.retailStoreID) )
		{
			return false;
		}
		if ( transactionSequenceNumber != other.transactionSequenceNumber )
		{
			return false;
		}
		if ( workstationID == null )
		{
			if ( other.workstationID != null )
			{
				return false;
			}
		}
		else if ( !workstationID.equals(other.workstationID) )
		{
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "RetailTransaction [retailStoreID=" + retailStoreID + ", workstationID=" + workstationID
				+ ", businessDayDate=" + businessDayDate + ", transactionSequenceNumber=" + transactionSequenceNumber
				+ ", operatorID=" + operatorID + ", transactionTypeCode=" + transactionTypeCode
				+ ", workstationStartDateTimestamp=" + workstationStartDateTimestamp + ", beginDateTimestamp="
				+ beginDateTimestamp + ", endDateTimestamp=" + endDateTimestamp + ", trainingFlag=" + trainingFlag
				+ ", keyedOfflineFlag=" + keyedOfflineFlag + ", transactionStatusCode=" + transactionStatusCode
				+ ", salesAssociateIDEmployeeID=" + salesAssociateIDEmployeeID + ", customerInfo=" + customerInfo
				+ ", customerInfoType=" + customerInfoType + ", tenderRepositoryID=" + tenderRepositoryID
				+ ", currencyID=" + currencyID + ", transactionTLogBatchID=" + transactionTLogBatchID
				+ ", transactionArchiveBatchID=" + transactionArchiveBatchID + ", transactionRTLogBatchID="
				+ transactionRTLogBatchID + ", inventoryReservationBatchID=" + inventoryReservationBatchID
				+ ", transactionPostProcessingStatusCode=" + transactionPostProcessingStatusCode
				+ ", transactionReentryFlag=" + transactionReentryFlag + ", salesAssociateModifiedFlag="
				+ salesAssociateModifiedFlag + ", recordCreatedTimestamp=" + recordCreatedTimestamp
				+ ", recordLastModifiedTimestamp=" + recordLastModifiedTimestamp + ", taxExemptFlag=" + taxExemptFlag
				+ "]";
	}


}
