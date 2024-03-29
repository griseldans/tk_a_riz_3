// package apapedia.user.restservice;

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;
// import java.util.stream.Collectors;

// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;

// import apapedia.user.model.User;

// public class UserInfoDetails implements UserDetails{

//     private String username;
//     private boolean deleted;
//     private String password;
//     private List<GrantedAuthority> authorities;

//     public UserInfoDetails(User user) { 
//         this.password = user.getPassword();
//         this.username = user.getUsername();
//         this.deleted = user.isDeleted();
//         this.authorities = Arrays.stream(user.getRole().split(",")) 
//                 .map(SimpleGrantedAuthority::new) 
//                 .collect(Collectors.toList()); 
//     }

//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         return this.authorities;
//     }

//     @Override
//     public String getPassword() {
//         return this.password;
//     }

//     @Override
//     public String getUsername() {
//         return this.username;
//     }

//     @Override
//     public boolean isAccountNonExpired() {
//         return !this.deleted;
//     }

//     @Override
//     public boolean isAccountNonLocked() {
//         return !this.deleted;
//     }

//     @Override
//     public boolean isCredentialsNonExpired() {
//         return !this.deleted;
//     }

//     @Override
//     public boolean isEnabled() {
//         return !this.deleted;
//     }
    
// }
