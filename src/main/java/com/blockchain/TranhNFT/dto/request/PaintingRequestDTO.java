package com.blockchain.TranhNFT.dto.request;

import java.io.Serializable;
import java.util.Date;

public class PaintingRequestDTO implements Serializable {
    private int paintingId;
    private String title;
    private String paintingDescription;
    private double price;
    private int artistId;
    private String imageUrl;
    private Date createdAt;

    public PaintingRequestDTO(int paintingId, String title, String paintingDescription, double price, int artistId, String imageUrl, Date createdAt) {
        this.paintingId = paintingId;
        this.title = title;
        this.paintingDescription = paintingDescription;
        this.price = price;
        this.artistId = artistId;
        this.imageUrl = imageUrl;
        this.createdAt = createdAt;
    }

    public int getPaintingId() {
        return paintingId;
    }

    public String getTitle() {
        return title;
    }

    public String getPaintingDescription() {
        return paintingDescription;
    }

    public double getPrice() {
        return price;
    }

    public int getArtistId() {
        return artistId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
