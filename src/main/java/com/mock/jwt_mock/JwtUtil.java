package com.mock.jwt_mock;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;

import java.util.Date;

public class JwtUtil {
    private static final String SECRET = "mysupersecretkey1234567890";

    private static SecretKey getSigningKey() {
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600_000)) // 1 час
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }
}
