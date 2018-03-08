package com.frans.mongo.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;


public class Event {
    @Id
	private String id;
	private Date startDate;
	private Date endDate;
	private String periodShort;
	private String time;
	private String periodLong;
	private String audience;
	private String admission;
	private String info;
	private String infoLink;
	private String duration;
	private Boolean featured;
	private String mapPinIcon;
	private String ticketingUrl;
	
	private String parentCompanyID;
	private String type;
	private String lang;
	private String lastModified;
	private String shareUri;
	private String title;
	private String categoryId;
	private String categoryName;
	private String categoryKey;
	private String categoryIcon;
	private String categoryMapPinIcon;
	private String[] categoryIds;
	private Object categories;
	private String iconPath;
	private String imagePath;
	private String[] galleryImages;
	private String[] tags;
	private String description;
	private String venue;
	private String geolocation;
	private String phone;
	private String website;
	private String email;
	private String address;
	private String hours;
	private String rating;
	private String rank;
	private String keywords;
	private String lmwidget;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getPeriodShort() {
		return periodShort;
	}
	public void setPeriodShort(String periodShort) {
		this.periodShort = periodShort;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPeriodLong() {
		return periodLong;
	}
	public void setPeriodLong(String periodLong) {
		this.periodLong = periodLong;
	}
	public String getAudience() {
		return audience;
	}
	public void setAudience(String audience) {
		this.audience = audience;
	}
	public String getAdmission() {
		return admission;
	}
	public void setAdmission(String admission) {
		this.admission = admission;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfoLink() {
		return infoLink;
	}
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Boolean getFeatured() {
		return featured;
	}
	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}
	public String getMapPinIcon() {
		return mapPinIcon;
	}
	public void setMapPinIcon(String mapPinIcon) {
		this.mapPinIcon = mapPinIcon;
	}
	public String getTicketingUrl() {
		return ticketingUrl;
	}
	public void setTicketingUrl(String ticketingUrl) {
		this.ticketingUrl = ticketingUrl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentCompanyID() {
		return parentCompanyID;
	}
	public void setParentCompanyID(String parentCompanyID) {
		this.parentCompanyID = parentCompanyID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getShareUri() {
		return shareUri;
	}
	public void setShareUri(String shareUri) {
		this.shareUri = shareUri;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryKey() {
		return categoryKey;
	}
	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
	}
	public String getCategoryIcon() {
		return categoryIcon;
	}
	public void setCategoryIcon(String categoryIcon) {
		this.categoryIcon = categoryIcon;
	}
	public String getCategoryMapPinIcon() {
		return categoryMapPinIcon;
	}
	public void setCategoryMapPinIcon(String categoryMapPinIcon) {
		this.categoryMapPinIcon = categoryMapPinIcon;
	}
	public String[] getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(String[] categoryIds) {
		this.categoryIds = categoryIds;
	}
	public Object getCategories() {
		return categories;
	}
	public void setCategories(Object categories) {
		this.categories = categories;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String[] getGalleryImages() {
		return galleryImages;
	}
	public void setGalleryImages(String[] galleryImages) {
		this.galleryImages = galleryImages;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getGeolocation() {
		return geolocation;
	}
	public void setGeolocation(String geolocation) {
		this.geolocation = geolocation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getLmwidget() {
		return lmwidget;
	}
	public void setLmwidget(String lmwidget) {
		this.lmwidget = lmwidget;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admission == null) ? 0 : admission.hashCode());
		result = prime * result + ((audience == null) ? 0 : audience.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((categoryIcon == null) ? 0 : categoryIcon.hashCode());
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((categoryIds == null) ? 0 : categoryIds.hashCode());
		result = prime * result + ((categoryKey == null) ? 0 : categoryKey.hashCode());
		result = prime * result + ((categoryMapPinIcon == null) ? 0 : categoryMapPinIcon.hashCode());
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((featured == null) ? 0 : featured.hashCode());
		result = prime * result + ((galleryImages == null) ? 0 : galleryImages.hashCode());
		result = prime * result + ((geolocation == null) ? 0 : geolocation.hashCode());
		result = prime * result + ((hours == null) ? 0 : hours.hashCode());
		result = prime * result + ((iconPath == null) ? 0 : iconPath.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imagePath == null) ? 0 : imagePath.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((infoLink == null) ? 0 : infoLink.hashCode());
		result = prime * result + ((keywords == null) ? 0 : keywords.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
		result = prime * result + ((lmwidget == null) ? 0 : lmwidget.hashCode());
		result = prime * result + ((mapPinIcon == null) ? 0 : mapPinIcon.hashCode());
		result = prime * result + ((parentCompanyID == null) ? 0 : parentCompanyID.hashCode());
		result = prime * result + ((periodLong == null) ? 0 : periodLong.hashCode());
		result = prime * result + ((periodShort == null) ? 0 : periodShort.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((shareUri == null) ? 0 : shareUri.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((ticketingUrl == null) ? 0 : ticketingUrl.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((venue == null) ? 0 : venue.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
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
		Event other = (Event) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (admission == null) {
			if (other.admission != null)
				return false;
		} else if (!admission.equals(other.admission))
			return false;
		if (audience == null) {
			if (other.audience != null)
				return false;
		} else if (!audience.equals(other.audience))
			return false;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (categoryIcon == null) {
			if (other.categoryIcon != null)
				return false;
		} else if (!categoryIcon.equals(other.categoryIcon))
			return false;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (categoryIds == null) {
			if (other.categoryIds != null)
				return false;
		} else if (!categoryIds.equals(other.categoryIds))
			return false;
		if (categoryKey == null) {
			if (other.categoryKey != null)
				return false;
		} else if (!categoryKey.equals(other.categoryKey))
			return false;
		if (categoryMapPinIcon == null) {
			if (other.categoryMapPinIcon != null)
				return false;
		} else if (!categoryMapPinIcon.equals(other.categoryMapPinIcon))
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (featured == null) {
			if (other.featured != null)
				return false;
		} else if (!featured.equals(other.featured))
			return false;
		if (galleryImages == null) {
			if (other.galleryImages != null)
				return false;
		} else if (!galleryImages.equals(other.galleryImages))
			return false;
		if (geolocation == null) {
			if (other.geolocation != null)
				return false;
		} else if (!geolocation.equals(other.geolocation))
			return false;
		if (hours == null) {
			if (other.hours != null)
				return false;
		} else if (!hours.equals(other.hours))
			return false;
		if (iconPath == null) {
			if (other.iconPath != null)
				return false;
		} else if (!iconPath.equals(other.iconPath))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imagePath == null) {
			if (other.imagePath != null)
				return false;
		} else if (!imagePath.equals(other.imagePath))
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (infoLink == null) {
			if (other.infoLink != null)
				return false;
		} else if (!infoLink.equals(other.infoLink))
			return false;
		if (keywords == null) {
			if (other.keywords != null)
				return false;
		} else if (!keywords.equals(other.keywords))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (lastModified == null) {
			if (other.lastModified != null)
				return false;
		} else if (!lastModified.equals(other.lastModified))
			return false;
		if (lmwidget == null) {
			if (other.lmwidget != null)
				return false;
		} else if (!lmwidget.equals(other.lmwidget))
			return false;
		if (mapPinIcon == null) {
			if (other.mapPinIcon != null)
				return false;
		} else if (!mapPinIcon.equals(other.mapPinIcon))
			return false;
		if (parentCompanyID == null) {
			if (other.parentCompanyID != null)
				return false;
		} else if (!parentCompanyID.equals(other.parentCompanyID))
			return false;
		if (periodLong == null) {
			if (other.periodLong != null)
				return false;
		} else if (!periodLong.equals(other.periodLong))
			return false;
		if (periodShort == null) {
			if (other.periodShort != null)
				return false;
		} else if (!periodShort.equals(other.periodShort))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (shareUri == null) {
			if (other.shareUri != null)
				return false;
		} else if (!shareUri.equals(other.shareUri))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (ticketingUrl == null) {
			if (other.ticketingUrl != null)
				return false;
		} else if (!ticketingUrl.equals(other.ticketingUrl))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (venue == null) {
			if (other.venue != null)
				return false;
		} else if (!venue.equals(other.venue))
			return false;
		if (website == null) {
			if (other.website != null)
				return false;
		} else if (!website.equals(other.website))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Event [startDate=" + startDate + ", endDate=" + endDate + ", periodShort=" + periodShort + ", time="
				+ time + ", periodLong=" + periodLong + ", audience=" + audience + ", admission=" + admission
				+ ", info=" + info + ", infoLink=" + infoLink + ", duration=" + duration + ", featured=" + featured
				+ ", mapPinIcon=" + mapPinIcon + ", ticketingUrl=" + ticketingUrl + ", id=" + id + ", parentCompanyID="
				+ parentCompanyID + ", type=" + type + ", lang=" + lang + ", lastModified=" + lastModified
				+ ", shareUri=" + shareUri + ", title=" + title + ", categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", categoryKey=" + categoryKey + ", categoryIcon=" + categoryIcon
				+ ", categoryMapPinIcon=" + categoryMapPinIcon + ", categoryIds=" + categoryIds + ", categories="
				+ categories + ", iconPath=" + iconPath + ", imagePath=" + imagePath + ", galleryImages="
				+ galleryImages + ", tags=" + tags + ", description=" + description + ", venue=" + venue
				+ ", geolocation=" + geolocation + ", phone=" + phone + ", website=" + website + ", email=" + email
				+ ", address=" + address + ", hours=" + hours + ", rating=" + rating + ", rank=" + rank + ", keywords="
				+ keywords + ", lmwidget=" + lmwidget + "]";
	}
	
	
}
