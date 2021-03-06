package walmart;

public class Item {

	private String name;
	private double salePrice;
	private String shortDescription;
	private boolean availableOnline;
	private String thumbnailImage;

	public String getName() {
		return name;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public boolean getAvailableOnline() {
		return availableOnline;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		return builder.toString();
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}
}
